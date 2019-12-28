package emil.l3Conditionals.enumsDays;

public class Days {
    public enum Day {
        MONDAY(1, "Понеделник"),
        THUESDAY(2, "Вторник"),
        WEDNESDAY(3, "Сряда"),
        THURSDAY(4, "Четвъртък"),
        FRIDAY(5, "Петък"),
        SATURDAY(6, "Събота"),
        SUNDAY(7, "Неделя");

        Day(int num) {
            this.num = num;
        }
        private int num;



        public int getNum() {
            return num;
        }
        public void setNum(int num) {
            this.num = num;
        }
    }

}
