package org.example;


import java.util.ArrayList;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {
        ArrayList<Student> students=new ArrayList<Student>();
        students.add(new Student(1, "Иван", "Иванович", "Иванов", "01.01.1998", "ул. Белорусская д.21,блок 612", "38044555667712", "ФИТ", 1, 3));
        students.add(new Student(2, "Петр", "Петрович", "Петров", "12.04.1997", "ул. Белорусская д.21,блок 613", "38044555667713", "Журналистика", 2, 321));
        students.add(new Student(3, "Семен", "Семенович", "Семенов", "10.07.1996", "ул. Белорусская д.21,блок 616", "38044555667714", "Юридический", 3, 231));
        students.add(new Student(4, "Константин", "Иванович", "Галушко", "04.09.1999", "ул. Белорусская д.19,блок 612", "38044555667715", "ФИТ", 1, 123));
        students.add(new Student(5, "Сергей", "Петрович", "Пивоваров", "03.04.1998", "ул. Белорусская д.19,блок 612", "38044555667716", "Журналистика", 2, 321));

        StudentRepository repository=new StudentRepository(students);

        repository.ListOfStudentsFaculty("ФИТ");

        repository.ListsOfStudentsForEveryFaculty();

        repository.ListsOfStudentsForEveryCourse();

        repository.ListOfStudentsGroup(321,"Журналистика",2);

    }
}