public class Test {


	public static void main(String[] args) {

		String[] monTableau = {"test", "sandra", "retest", "undernier"};
		capitalize(monTableau);

		System.out.println(monTableau[0]);

		for (String test : monTableau) {
			System.out.println(test);
		}
	}

    public static String[] capitalize(String[] array) {
        /*for (String value : array) {
            value = value.substring(0, 1).toUpperCase() + value.substring(1);
        }*/

        array[0] = array[0].substring(0, 1).toUpperCase() + array[0].substring(1);
        return array;
    }
}