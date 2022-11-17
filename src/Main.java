public class Main {
	public static void main(String[] args) {
		// Задача 1
		System.out.println("Задача 1");
		{
			String firstName = " Ivan ";
			String middleName = " Ivanovich ";
			String lastName = "Ivanov ";
			String fullName = " ФИО сотрудника - ";
			System.out.println( fullName + lastName + firstName + middleName);
		}
		// Задача 2
		System.out.println("Задача 2");
		{
			String firstName = " Ivan ";
			String middleName = " Ivanovich ";
			String lastName = "Ivanov ";
			String fullName = " Данные ФИО сотрудника для заполнения отчета — ";
			System.out.println( fullName + lastName.toUpperCase()+ firstName.toUpperCase()+ middleName.toUpperCase());
		}
		// Задача 3
		System.out.println("Задача 3");
		{
			String firstName = " Артём ";
			String middleName = " Фёдорович ";
			String lastName = "Иванов ";
			String fullName = " Данные ФИО сотрудника —  ";
			String anotherFirstName = firstName.replace( 'ё', 'е');
			String anotherMiddleName = middleName.replace('ё', 'е');
			System.out.println( fullName + lastName+ anotherFirstName + anotherMiddleName );
		}

	}
}