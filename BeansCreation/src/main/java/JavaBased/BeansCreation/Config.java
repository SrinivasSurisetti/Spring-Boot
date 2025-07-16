package JavaBased.BeansCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	@Bean //For GetterSetter
	public GetterSetter display() {
		GetterSetter gs = new GetterSetter();
		gs.setRoll("22MH1A05L6");
		gs.setName("Srinivas Surisetti");
		gs.setBranch("CSE");
		return gs;
	}
	@Bean("vaasu")
	public Constructor app(){
		Constructor ct = new Constructor("22MH1A05L6","SRINIVAS SURISETTI","CSE");
		return ct;
	}
}
