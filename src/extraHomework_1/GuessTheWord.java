package extraHomework_1;

public class GuessTheWord {
    private String[] originalWords;
    private String secretWord;
    private char[] mockWord;
    private char[] letterSecretWord;

    public void createOriginalWords() {
        this.originalWords = new String[]{
                "яблоко", "банан", "апельсин", "груша", "слива",
                "вишня", "персик", "абрикос", "киви", "манго",
                "ананас", "лимон", "лайм", "виноград", "дыня",
                "арбуз", "гранат", "инжир", "папайя", "кокос"
        };
    }

    public void askQuestion() {
        String[] questions = new String[]{
                "Этот фрукт бывает красным или зелёным, а ещё он стал символом компании Apple", // яблоко
                "Любимое лакомство обезьян в вытянутой жёлтой кожуре", // банан
                "Круглый цитрус оранжевого цвета, чьё название на английском совпадает с цветом", // апельсин
                "Фрукт, который по своей форме больше всего напоминает электрическую лампочку", // груша
                "Тёмно-синий или фиолетовый плод, который после сушки превращается в чернослив", // слива
                "Маленькая круглая красная ягода с косточкой, популярная для компотов и варенья", // вишня
                "Крупный сочный плод с бархатистой шкуркой и большой рельефной косточкой", // персик
                "Оранжевый летний плод, из которого делают курагу", // абрикос
                "Небольшой овальный плод с мохнатой коричневой кожурой и яркой зелёной мякотью", // киви
                "Тропический фрукт со сладкой оранжевой мякотью и большой плоской косточкой", // манго
                "Крупный тропический плод с жёсткой чешуйчатой кожурой и хохолком из листьев", // ананас
                "Очень кислый жёлтый цитрус, который принято добавлять в чай", // лимон
                "Зелёный кислый цитрус, близкий родственник лимона и важная часть коктейля Мохито", // лайм
                "Гроздья этих сладких ягод используют для производства изюма и вина", // виноград
                "Очень ароматная, большая и сладкая бахчевая культура жёлтого цвета", // дыня
                "Огромная полосатая бахчевая ягода с красной сахарной мякотью и чёрными семечками", // арбуз
                "Южный плод с твёрдой коркой, внутри которого прячутся сотни рубиновых зёрен", // гранат
                "Очень сладкий и мягкий плод фигового дерева с множеством мелких семян", // инжир
                "Экзотический тропический фрукт, который также называют хлебным деревом", // папайя
                "Твёрдый тропический орех с белой мякотью и сладким молоком внутри" // кокос
        };

        for (int i = 0; i < originalWords.length; i++) {
            if (originalWords[i].equals(secretWord)) {
                System.out.println(questions[i]);
            }
        }
    }


    public void makeSecretWord() {
        double random = Math.random();
        int wordIndex = (int) (random * 20);
        this.secretWord = this.originalWords[wordIndex];
    }

    public void makeArreyOfSecretWord() {
        this.letterSecretWord = this.secretWord.toCharArray();
    }

    public void hideArreyGetters() {
        this.mockWord = new char[this.secretWord.length()];
        for (int i = 0; i < this.secretWord.length(); i++) {
            this.mockWord[i] = '*';
        }
    }

    public boolean insertLetterOfWord(String word) {
        boolean isLetterAchived = false;
        if (secretWord.equals(word) && word.length() > 1) {
            System.out.println("Вы угадали слово целиком!");
            return true;
        } else if (word.length() > 1) {
            System.out.println("Неверное слово");
            return false;
        }
        if (word.length() == 1) {
            for (int i = 0; i < this.letterSecretWord.length; i++) {
                char letter = word.charAt(0);
                if (this.letterSecretWord[i] == letter) {
                    this.mockWord[i] = letter;
                    isLetterAchived = true;
                }
            }
            if (isLetterAchived) {
                System.out.println("Верная буква");
            } else {
                System.out.println("Неверная буква");
            }
        }

        String checkWorld = new String(mockWord);
        if (checkWorld.equals(secretWord)) {
            return true;
        }

        return false;
    }


    public char[] getLetterSecretWord() {
        return letterSecretWord;
    }

    public char[] getMockWord() {
        return mockWord;
    }

    public String[] getOriginalWords() {
        return originalWords;
    }

    public String getSecretWord() {
        return secretWord;
    }
}
