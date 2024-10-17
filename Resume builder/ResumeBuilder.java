import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.Pattern;
import java.util.function.Predicate;

public class ResumeBuilder {
    // Updated template with better formatting, separators, and bullet points
    private static final String TEMPLATE = 
        "##############################################\n" +
        "#                PROFESSIONAL RESUME         #\n" +
        "##############################################\n\n" +
        "----------------------------------------------\n" +
        " %s\n" +
        " %s | %s\n" +
        "----------------------------------------------\n\n" +
        "PROFESSIONAL SUMMARY\n" +
        "----------------------------------------------\n" +
        "%s\n\n" +
        "EDUCATION\n" +
        "----------------------------------------------\n" +
        "%s\n\n" +
        "WORK EXPERIENCE\n" +
        "----------------------------------------------\n" +
        "%s\n\n" +
        "SKILLS\n" +
        "----------------------------------------------\n" +
        "%s\n\n" +
        "ACHIEVEMENTS\n" +
        "----------------------------------------------\n" +
        "%s\n\n" +
        "REFERENCES\n" +
        "----------------------------------------------\n" +
        "Available upon request\n" +
        "----------------------------------------------";

    private static String name, email, phone, summary;
    private static List<String> education = new ArrayList<>();
    private static List<String> workExperience = new ArrayList<>();
    private static List<String> skills = new ArrayList<>();
    private static List<String> achievements = new ArrayList<>();

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\+?\\d{10,14}$");

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<?> inputFuture = executor.submit(ResumeBuilder::getUserInput);
        Future<String> templateFuture = executor.submit(ResumeBuilder::prepareTemplate);

        try {
            inputFuture.get(); // Wait for user input to complete
            String resumeContent = templateFuture.get(); // Get the prepared template
            saveResumeToFile(resumeContent);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        name = getValidInput(scanner, "Enter your full name: ", ResumeBuilder::isValidName);
        email = getValidInput(scanner, "Enter your email address: ", ResumeBuilder::isValidEmail);
        phone = getValidInput(scanner, "Enter your phone number: ", ResumeBuilder::isValidPhone);

        System.out.print("Enter a brief professional summary: ");
        summary = scanner.nextLine();

        // Education
        System.out.println("Enter your educational background (type 'done' when finished):");
        while (true) {
            System.out.print("Degree, University, Year: ");
            String edu = scanner.nextLine();
            if (edu.equalsIgnoreCase("done")) break;
            education.add("• " + edu); // Add bullet point for each entry
        }

        // Work Experience
        System.out.println("Enter your work experience (type 'done' when finished):");
        while (true) {
            System.out.print("Job Title, Company, Duration: ");
            String job = scanner.nextLine();
            if (job.equalsIgnoreCase("done")) break;
            System.out.print("Job Description: ");
            String desc = scanner.nextLine();
            workExperience.add("• " + job + "\n   - " + desc); // Indentation for description
        }

        // Skills
        System.out.println("Enter your key skills (type 'done' when finished):");
        while (true) {
            System.out.print("Skill: ");
            String skill = scanner.nextLine();
            if (skill.equalsIgnoreCase("done")) break;
            skills.add("• " + skill);
        }

        // Achievements
        System.out.println("Enter your notable achievements (type 'done' when finished):");
        while (true) {
            System.out.print("Achievement: ");
            String achievement = scanner.nextLine();
            if (achievement.equalsIgnoreCase("done")) break;
            achievements.add("• " + achievement);
        }

        scanner.close();
    }

    private static String getValidInput(Scanner scanner, String prompt, Predicate<String> validator) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (!validator.test(input)) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validator.test(input));
        return input;
    }

    private static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("^[a-zA-Z\\s'-]+$");
    }

    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    private static boolean isValidPhone(String phone) {
        return phone != null && PHONE_PATTERN.matcher(phone).matches();
    }

    private static String prepareTemplate() {
        // Simulate some time-consuming task
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return TEMPLATE;
    }

    private static void saveResumeToFile(String template) {
        String educationString = String.join("\n", education);
        String workExperienceString = String.join("\n\n", workExperience);
        String skillsString = String.join("\n", skills);
        String achievementsString = String.join("\n", achievements);

        String resumeContent = String.format(template, 
            name, email, phone, summary, educationString, workExperienceString, 
            skillsString, achievementsString);

        String fileName = name.replaceAll("\\s+", "_").toLowerCase() + "_professional_resume.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(resumeContent);
            System.out.println("Professional resumeaer has been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the resume.");
            e.printStackTrace();
        }
    }
}
