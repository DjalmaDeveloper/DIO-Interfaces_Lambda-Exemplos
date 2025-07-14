package src;

import java.util.List;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		List<User> users = List.of(new User("Maria", 21), new User("João", 32),
				new User("Eduardo", 40), new User("Ana", 19));
		printStringValues(Record::toString, users); // RETORNANDO OBJETO COMPLETO
		// OU printStringValues(user -> user.toString(), users);
		// RETORNANDO AGES printStringValues(user -> String.valueOf(user.age()), users);
		// RETORNANDO NOMES printStringValues(User::name, users);
		// OU printStringValues(user -> user.name(), users);
	}
	
	private static void printStringValues(Function<User, String> callback, List<User> users) {
		users.forEach(u -> System.out.println(callback.apply(u)));
	}
}

/*var consumer = new Consumer<User>() {

			@Override
			public void accept(User user) {
				System.out.println(user);	
			}
		};
		
OU

users.forEach(new Consumer<User>() {

			@Override
			public void accept(User user) {
				System.out.println(user);	
			}
		});
		
OU

users.forEach((User user) -> {
				System.out.println(user);	
		});
		
OU

users.forEach(user -> {
				System.out.println(user);	
		});

OU

users.forEach(user -> System.out.println(user));

OU

users.forEach(System.out::println);
*/