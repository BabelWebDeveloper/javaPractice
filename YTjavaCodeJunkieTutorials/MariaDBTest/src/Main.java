import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//        mariaDB commands:

//        show databases;
//        create database database_name;
//        drop database database_name;
//        alter database database_name collate='utf8mb4_unicode_ci'; /*- zmiana wartości parametru collate*/
//        use database_name; /*- użycie/przełączenie się na konkretną bazę danych*/

//---------------------------------STWORZENIE NOWEJ TABELI:
//         create table employees (
//    -> id int not null primary key auto_increment,
//    -> employee_id int not null unique key,
//    -> first_name varchar(30) not null,
//    -> last_name varchar(30) not null,
//    -> birth_date date,
//    -> dept_id int not null,
//    -> CONSTRAINT fk_dept_id  /*ograniczenia dla foreign key*/
//    ->  FOREIGN KEY (dept_id) REFERENCES departments (id)
//    ->  ON DELETE RESTRICT /*ograniczenie przed usunięciem dla foreign key jeśli są do niego przypisane jakieś dept_id*/
//    ->  ON UPDATE RESTRICT
//    -> );

//---------------------------------WPROWADZANIE DANYCH DO TABELI:
// INSERT INTO employees (employee_id, first_name, last_name, birth_date, dept_id) VALUES (123456, 'John','Doe','1985-12-14',1); /*- wprowadzanie danych do tabeli - jeśli jest foreign key - tutaj dept_id - musi istnieć w drugiej tabeli primary key i musi się on zgadzać z primary key - w tym przypadku oba musża mieć wartość 1*/

//---------------------------------WYŚWIETLANIE TABELI:
//        describe table_name; /*- wyświetla tabelę*/

//---------------------------------ZAŁADOWANIE DANYCH DO TABELI Z PLIKU:
//        LOAD DATA LOCAL INFILE 'c:\Users\przem\OneDrive\SQL\departments.csv' /*ładowanie danych z pliku*/
//    -> INTO TABLE departments
//    -> FIELDS TERMINATED BY ','
//    -> LINES TERMINATED BY '\r\n' /*?*/
//    -> IGNORE 1 LINES
//    -> (id, text);

//---------------------------------UPDATE DANYCH W TABELI:
//       UPDATE employees
//    -> SET last_name = 'Nielsen'
//    -> WHERE employee_id = 123456;

// zmiana dept_id na 7 dla wszystkich pracowników których dept_id jest równe 1:
//  UPDATE employees SET dept_id = 7 WHERE dept_id = 1;

//---------------------------------USUWANIE DANYCH Z TABELI:
//DELETE FROM departments WHERE id = 1;/*to można usunąć mimo restykcji ponieważ wcześniej updatowaliśmy dane - wszystkich pracowników z dept_id = 1 updatowano na dept_id = 7*/

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String url = "jdbc:mariadb://localhost:3306/tutorial";//tutorial - nazwa bazy danych
        String user = "root";
        String password = "nieznamDix37";

        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Successfully connected!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connected failed!");
        }

    }
}
