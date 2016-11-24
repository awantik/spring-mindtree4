package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIAnnotationMain {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(AppConfig.class);
		ShoeShowRoom ssr = appCtxt.getBean(ShoeShowRoom.class);
		ShoeShowRoom ssr2 = appCtxt.getBean(ShoeShowRoom.class);
		if( ssr.s1 == ssr2.s1 ){
			System.out.println("They are same");
			if( ssr == ssr2 ){
				System.out.println("ssr also same");
			}
		} else {
			System.out.println("They are different");
		}
		
		MutiShowRoom msr = appCtxt.getBean(MutiShowRoom.class);
		msr.s[0].makeShoeLookGood();
		
	

	}

}
