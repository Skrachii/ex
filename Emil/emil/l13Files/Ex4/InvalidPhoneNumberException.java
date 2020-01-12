package emil.l13Files.Ex4;
// Можем да хвърляме Exception само когато са в йерархията в Throwable. Ако наследява Exception , трябва експлицитно
// да се декларира нещо , че сме готови да се обработи това изключение.
public class InvalidPhoneNumberException extends Exception { // Ако не се декларира експлицитно ще има компилационни грешки.
    public InvalidPhoneNumberException(String message) { // Конструктор Alt + Insert; създаване на Exception;
        super(message);
    }
}
