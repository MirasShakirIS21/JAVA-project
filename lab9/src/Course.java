// Базовый класс
class Course {
    String title;

    Course(String title) {
        this.title = title;
    }

    void startCourse() {
        System.out.println(title + " course is starting.");
    }

    public static void main(String[] args) {
        Course programming = new ProgrammingCourse("Java Programming");
        Course math = new MathCourse("Mathematics");
        Course history = new HistoryCourse("History");

        programming.startCourse();
        math.startCourse();
        history.startCourse();
    }
}

// Производный класс ProgrammingCourse
class ProgrammingCourse extends Course {
    ProgrammingCourse(String title) {
        super(title);
    }

    @Override
    void startCourse() {
        System.out.println(title + " course starts with coding exercises.");
    }
}

// Производный класс MathCourse
class MathCourse extends Course {
    MathCourse(String title) {
        super(title);
    }

    @Override
    void startCourse() {
        System.out.println(title + " course starts with problem solving.");
    }
}

// Производный класс HistoryCourse
class HistoryCourse extends Course {
    HistoryCourse(String title) {
        super(title);
    }

    @Override
    void startCourse() {
        System.out.println(title + " course starts with historical overview.");
    }
}