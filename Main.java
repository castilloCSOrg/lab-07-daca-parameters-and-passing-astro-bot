public class Main {

        // ASCII Art and Constants
        final static String ASCII_ART_0 = "    .----.    .----.  ",
                ASCII_ART_1 = "   (  --  \\  /  --  )",
                ASCII_ART_2 = "          |  |        ",
                ASCII_ART_3 = "         _/  \\_      ",
                ASCII_ART_4 = "        (_    _)      ",
                ASCII_ART_5 = "     ,    `--`    ,   ",
                ASCII_ART_6 = "     \\'-.______.-'/  ",
                ASCII_ART_7 = "      \\          /   ",
                ASCII_ART_8 = "       '.--..--.'     ",
                ASCII_ART_9 = "         `\"\"\"\"\"` ",
                ASCII_CREDIT = "   ascii art by: jgs    ";
    
        final static String TITLE_USA = "UNITED STATES OF AMERICA",
                TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        final static String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
                LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
                LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
                LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
                LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
    
        public static void main(String[] args) {
    
            // Data Initialization
            String surname = "CHAPETON-LAMAS";
            String givenName = "NERY";
            String category = "C09";
            String cardNum = "SRC9876543210";
            String birthCountry = "Guatemala";
            String termsAndConditions = "None";
            char sex = 'M';
    
            String birthMonth = "JAN";
            int uscisNum1 = 12, uscisNum2 = 4, uscisNum3 = 789, birthDay = 1, birthYear = 1970;
            int validDay = 2, validMonth = 2, validYear = 2020, expireMonth = 2, expireDay = 2, expireYear = 2022;
    
            // Format USCIS number and dates
            String uscisNum = String.format("%03d-%03d-%03d", uscisNum1, uscisNum2, uscisNum3);
            String dateOfBirth = String.format("%02d %s %04d", birthDay, birthMonth, birthYear);
            String validDate = formatDate(validMonth, validDay, validYear);
            String expireDate = formatDate(expireMonth, expireDay, expireYear);
    
            // Call formatCard to get the formatted card string
            String card = formatCard(surname, givenName, category, cardNum, birthCountry, termsAndConditions,
                                     sex, uscisNum, dateOfBirth, validDate, expireDate);
    
            // Output formatted card
            System.out.println(card);
        }
    
        // Static method to format the Employment Authorization Card
        public static String formatCard(String surname, String givenName, String category, String cardNum,
                                        String birthCountry, String termsAndConditions, char sex, String uscisNum,
                                        String dateOfBirth, String validDate, String expireDate) {
    
            // Construct the formatted card output as a string
            String card = "╔══════════════════════════════════════════════════════════════════════╗\n";
            card += String.format("║%35s%35s║\n", TITLE_USA, "");
            card += String.format("║%60s%10s║\n", TITLE_EAC, "");
            card += String.format("║%-25s%-45s║\n", "", LABEL_SURNAME);
            card += String.format("║%-25s%-45s║\n", "", surname);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_0, LABEL_GIVEN_NAME);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_1, givenName);
            card += String.format("║%-25s%-15s%-15s%-15s║\n", ASCII_ART_2, LABEL_USCIS_NUM, LABEL_CATEGORY, LABEL_CARD_NUM);
            card += String.format("║%-25s%-15s%-15s%-15s║\n", ASCII_ART_3, uscisNum, category, cardNum);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_4, LABEL_BIRTH_COUNTRY);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_5, birthCountry);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_6, LABEL_TERMS_CONDITIONS);
            card += String.format("║%-25s%-45s║\n", ASCII_ART_7, termsAndConditions);
            card += String.format("║%-25s%-15s%-30s║\n", ASCII_ART_8, LABEL_BIRTH_DATE, LABEL_SEX);
            card += String.format("║%-25s%-15s%-30s║\n", ASCII_ART_9, dateOfBirth, sex);
            card += String.format("║%-25s%-15s%-30s║\n", "", LABEL_VALID_DATE, validDate);
            card += String.format("║%-25s%-15s%-30s║\n", "", LABEL_EXPIRE_DATE, expireDate);
            card += String.format("║%-25s%-45s║\n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
            card += "╚══════════════════════════════════════════════════════════════════════╝";
    
            return card;
        }
    
        // Static method to format the date
        public static String formatDate(int month, int day, int year) {
            return String.format("%02d/%02d/%04d", month, day, year);
        }
    }