package j07_StringManipulations.tasks;

public class _05_String_methods02 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string representing a "Sprint Planning" document.
         * - Print the total number of characters in this document, including spaces and special characters.
         */

        String str = "Sprint Planning - Sprint #<Sprint Number>\n" +
                "\n" +
                "**Sprint Start Date:** <Start Date>\n" +
                "**Sprint End Date:** <End Date>\n" +
                "\n" +
                "**Sprint Goal:** \n" +
                "- <The main goal and deliverables intended for this sprint.>\n" +
                "\n" +
                "**Participants:**\n" +
                "- Product Owner: <Name>\n" +
                "- Scrum Master: <Name>\n" +
                "- Development Team Members: <Names>\n" +
                "\n" +
                "**Sprint Backlog:** \n" +
                "1. User Story #1: <Story description>\n" +
                "   - Task #1: <Task description>\n" +
                "   - Task #2: <Task description>\n" +
                "   - Estimated Time: <Estimated hours or points>\n" +
                "\n" +
                "2. User Story #2: <Story description>\n" +
                "   - Task #1: <Task description>\n" +
                "   - Task #2: <Task description>\n" +
                "   - Estimated Time: <Estimated hours or points>\n" +
                "\n" +
                "**Risks and Obstacles:**\n" +
                "- <Potential risks in this sprint and solutions to address them>\n" +
                "\n" +
                "**Definition of Done:**\n" +
                "- <Criteria for successfully completing the sprint goal>\n" +
                "\n" +
                "**Notes:**\n" +
                "- <Important reminders or additional information>\n";

        System.out.println("Total characters in the Sprint Planning document: " + str.length());

        /*
         * Explanation:
         * - The length() method calculates the total number of characters in the string,
         *   including spaces, newline characters (\n), and any other special symbols.
         * - This includes all text between quotes in the multi-line string.
         */
    }
}
