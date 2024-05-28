package design.patterns;

import design.patterns.adapter.AdapterMain;
import design.patterns.command.CommandMain;
import design.patterns.decorator.DecoratorMain;
import design.patterns.momento.MomentoMain;
import design.patterns.smarthomeautomation.SmartHomeAutomationMain;
import design.patterns.state.StateMain;
import design.patterns.strategy.StrategyMain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		log.info("\nAdapter Pattern");
		AdapterMain.main();
		log.info("\nCommand Pattern ");
		CommandMain.main();
		log.info("\nDecorator Pattern");
		DecoratorMain.main();
		log.info("\nMomento Pattern");
		MomentoMain.main();
		log.info("\nState Pattern");
		StateMain.main();
		log.info("\nStrategy Pattern");
		StrategyMain.main();
		SmartHomeAutomationMain.main();
	}
/*
Output
Adapter Pattern
2024-05-21T23:21:41.905+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.adapter.OldPrinterImpl   : Printing with old printer: Old Hello, world!
2024-05-21T23:21:41.909+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.adapter.ModernPrinter    : Printing with modern printer: New Hello, world!
2024-05-21T23:21:41.909+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :
Command Pattern
2024-05-21T23:21:41.913+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.command.Light            : Light is on
2024-05-21T23:21:41.914+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.command.Light            : Light is off
2024-05-21T23:21:41.914+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :
Decorator Pattern
2024-05-21T23:21:41.917+05:30  INFO 13824 --- [patterns] [  restartedMain] d.patterns.decorator.DecoratorMain       : Simple Coffee $5.0
2024-05-21T23:21:41.918+05:30  INFO 13824 --- [patterns] [  restartedMain] d.patterns.decorator.DecoratorMain       : Simple Coffee, Milk $6.5
2024-05-21T23:21:41.920+05:30  INFO 13824 --- [patterns] [  restartedMain] d.patterns.decorator.DecoratorMain       : Simple Coffee, Sugar, Milk $7.0
2024-05-21T23:21:41.921+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :
Momento Pattern
2024-05-21T23:21:41.923+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : a
2024-05-21T23:21:41.924+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : b
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : c
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : Undo
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : b
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : Undo
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.momento.MomentoMain      : a
2024-05-21T23:21:41.925+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :
State Pattern
2024-05-21T23:21:41.928+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.state.StartState         : Player is in start state
2024-05-21T23:21:41.928+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.state.StateMain          : Start State
2024-05-21T23:21:41.930+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.state.StopState          : Player is in stop state
2024-05-21T23:21:41.930+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.state.StateMain          : Stop State
2024-05-21T23:21:41.930+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :
Strategy Pattern
2024-05-21T23:21:41.934+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.strategy.JpegCompresor   : Applying Jpeg Compression on file = Policy
2024-05-21T23:21:41.934+05:30  INFO 13824 --- [patterns] [  restartedMain] design.patterns.strategy.Classic         : Applying classic filter on file = Policy
 */
}
