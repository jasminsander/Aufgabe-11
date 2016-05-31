package zaehlerprogramm;

public class Sprung<T,U> {

	public Sprung(boolean Fall, T t, U u){
		if(Fall == true){
			System.out.println(t);
		}else{
			System.out.println(u);
		}
	}
}
