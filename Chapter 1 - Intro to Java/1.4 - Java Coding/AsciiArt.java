public class AsciiArt {
    /* List of all requested art...
        Fish: ><(((('>
        Cat: =^..^=
        Rose: --------{---(@
        Worm: _/\__/\__0>
        Personal Message: (¯`·._.·(¯`·._.· Your Text ·._.·´¯)·._.·´¯)
        Caterpillar: ,/\,/\,/\,/\,/\,/\,o 
        Professor: ""⌐(ಠ۾ಠ)¬""
        I don't know: ¯\_(ツ)_/¯ 
        Mickey: 
                                 _____
                             .d88888888bo.
                            .d8888888888888b.
                            8888888888888888b
                            888888888888888888
                            888888888888888888
                            Y8888888888888888
                       ,od888888888888888888P
                    .'`Y8P'```'Y8888888888P'
                  .'_   `  _     'Y88888888b
                 /  _`    _ `      Y88888888b   ____
             _  | /  \  /  \      8888888888.d888888b.
            d8b | | /|  | /|      8888888888d8888888888b
            8888_\ \_|/  \_|/      d888888888888888888888b
            .Y8P  `'-.            d88888888888888888888888
            /          `          `      `Y8888888888888888
            |                        __    888888888888888P
            \                       / `   dPY8888888888P'
            '._                  .'     .'  `Y888888P`
                `"'-.,__    ___.-'    .-'
                    `-._````  __..--'`
                        ``````
     */
    
    private String mickeyText = "                                 _____\n";

    public AsciiArt() {
        mickeyText += "                             .d88888888bo.\n";
        mickeyText += "                            .d8888888888888b.\n";
        mickeyText += "                            8888888888888888b\n";
        mickeyText += "                            888888888888888888\n";
        mickeyText += "                            888888888888888888\n";
        mickeyText += "                            Y8888888888888888\n";
        mickeyText += "                       ,od888888888888888888P\n";
        mickeyText += "                    .'`Y8P'```'Y8888888888P'\n";
        mickeyText += "                  .'_   `  _     'Y88888888b\n";
        mickeyText += "                 /  _`    _ `      Y88888888b   ____\n";
        mickeyText += "             _  | /  \\  /  \\      8888888888.d888888b.\n";
        mickeyText += "            d8b | | /|  | /|      8888888888d8888888888b\n";
        mickeyText += "            8888_\\ \\_|/  \\_|/      d888888888888888888888b\n";
        mickeyText += "            .Y8P  `'-.            d88888888888888888888888\n";
        mickeyText += "            /          `          `      `Y8888888888888888\n";
        mickeyText += "            |                        __    888888888888888P\n";
        mickeyText += "            \\                       / `   dPY8888888888P'\n";
        mickeyText += "            '._                  .'     .'  `Y888888P`\n";
        mickeyText += "                `\"'-.,__    ___.-'    .-'\n";
        mickeyText += "                    `-._````  __..--'`\n";
        mickeyText += "                        ``````";
    }

    // Functions to print out requested art
    public void printFish() {
        System.out.println("><(((('>");
    }
    public void printCat() {
        System.out.println("=^..^=");
    }
    public void printRose() {
        System.out.println("--------{---(@");
    }

    public void printWorm() {
        System.out.println("_/\\__/\\__0>");
    }

    public void printPersonalMessage(String text) {
        System.out.println("(¯`·._.·(¯`·._.· " + text + " ·._.·´¯)·._.·´¯)");
    }

    public void printCaterpillar() {
        System.out.println(",/\\,/\\,/\\,/\\,/\\,/\\,o ");
    }

    public void printProfessor() {
        System.out.println("\"\"⌐(ಠ۾ಠ)¬\"\"");
    }

    public void printIDK() {
        System.out.println("¯\\_(ツ)_/¯");
    }

    public void printMickey() {
        System.out.println(mickeyText);
    }

    public void printAll(String personalMessageText) {
        printFish();
        printCat();
        printRose();
        printWorm();
        printPersonalMessage(personalMessageText);
        printCaterpillar();
        printProfessor();
        printIDK();
        printMickey();
    }
}