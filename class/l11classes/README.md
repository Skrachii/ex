# ООП - Класове

## Презентации
* [Класове](https://docs.google.com/presentation/d/1LZy7IJKDawJEKAIZQA8ANrdJ0VTD5IJsZ6ZqFupYZUQ/edit?usp=sharing)

## Видео
* [ООП 1](https://youtu.be/04m3URpkVQI)
* [ООП 2](https://youtu.be/gsLsLKqjgTs)
* [ООП 3](https://youtu.be/Eibn5Mj83-k)
* [ООП 4](https://youtu.be/ewDcopIIKT4)

## Упражнения

### Упр. 1

Създай клас, който да представлява студент със следните атрибути: име, възраст, среден успех. 
- Добави подходящи методи за достъпване и промяна на атрибутите (setters and getters / accessors and modifiers). 
- Добави метод toString(), който дава подходящо представяне на състоянието на обекта като символен низ. 
- Добави подходящи конструктори.
- Добави атрибут брояч, който да държи сметка за броят на съществуващите студенти. Използвай тази стойност за генерирането на уникален факултетен номер при създаването на обект студент.

### Упр. 2
Създай изброим тип (enumeration) Status, който да отразява валидните възможности за статуса на студента в учебното заведение: freshman, sophomore, junior, senior, BS. Създай атрибут на Student, който да има тип Status със съответните getter и setter. Създай метод boolean progress(), който да придвижва студента към следващия по-висок статус, освен ако вече не е завършил. Методът връща true, ако придвижването е успешно и false в случая, когато студентът е завършил.

### Упр. 3
Създай масив от 5 обекта от типа Student. Направи цикъл, който отпечатва съдържанието на масива.

### Упр. 4
Създай клас CyrillicUtil, представляващ програмен модул с три метода, който може да проверява дали текст съдържа символи от Кирилицата:
~~~
// Checks whether character is cyrillic
public static boolean isCyrillic(char c);

// Checks whether all characters in a string
// are cyrillic 
public static boolean allCyrillic(String s)

// Checks wheter some characters in a string
// are cyrillic
public static boolean someCyrillic(String s)
~~~

Подсказка: Символите на Кирилицата имат числови кодове между 1040 и 1103.


### Упр. 5

Целта на това упражнение е да се създаде клас, съответстващ на банкова сметка и съответните транзакции.
- Създай клас BankAccount със следните полета: 
    - id        // идентификатор
    - owner     // името на собвтвеника
    - balance   // сумата в акаунта
    - numTransactions  // броят изпълнени транзакции от последното изчисление на такси
- Създай подходящи getters и setters. Атрибутите id и numTransactions трябва да са read only - те само могат да се четат, но не могат да се променят произволно. Идентификаторът се създава само веднъж при създаването на акаунта, а броят на транзакциите се изчислява автоматично.
- Създай подходящ конструктор, който да приема името на собственика като параметър и да генерира уникален идентификатор.
- Създай подходящ toString() метод
- Създай метод deposit(double amount), който да добавя дадената сума към баланса. Методът трябва да увеличи броят на транзакциите с едно.
- Създай метод boolean withdraw(double amount), който да извади сумата от баланса. Ако парите в акаунта са достатъчни и транзакцията е успешна, методът връща true. Ако обаче балансът не е достатъчен да покрие исканата сума, методът връща false. Методът трябва да увеличи броят на транзакциите с едно.
- Създай метод applyMonthlyFees(). Методът изважда 2 лв. от баланса. Също, проверява дали броят на транзакциите е по-голям от 3. Ако да, тогава удържа допълнителен 0.1% от баланса в акаунта.
- Създай метод 
~~~
public boolean transfer(double amount, BankAccount other)
~~~
Методът трябва да трансферира дадената сума към дадения акаунт, ако балансът позволява. Трябва да връща true или false в зависимост от това дали транзакцията е успешна.
- Създайте няколко акаунта и тествайте да добавяте, да теглите и да трансферирате суми. След всяка транзакция отпечатвайте съдържанието на акаунта, за да проверите дали програмата работи както очаквате.

### Упр. 6
Създайте клас Bank. Този клас съдържа масив от BankAccount обекти, описани в предната задача. Създайте следните методи, които определят поведението на класа Bank.
~~~
public void addAccount(String owner);
public void removeAccount(String id);

// Get the account id for a customer 
public String getAccountId(String owner);

public void deposit(double amount, String id);
public boolean withdraw(double amount, String id);
public boolean transfer( double amount, String fromId, String toId);

// returns a string with all account info
public String getAccountList();

//returns total amount owned by all accounts
public double getTotalBankBalance();

//returns average account balance
public double getAverageAccountBalance();

//returns total number of transactions for all accounts
public int getTotalNumberOfTransactions();

//applies monthly fee to all accounts
public void applyMonthlyFee()
~~~ 
Тествайте класът като добавите няколко акаунта 