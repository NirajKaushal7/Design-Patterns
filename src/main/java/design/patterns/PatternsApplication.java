package design.patterns;

import design.patterns.adapter.AdapterMain;
import design.patterns.command.CommandMain;
import design.patterns.decorator.DecoratorMain;
import design.patterns.ecommerceplatform.ECommercePlatformMain;
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
		log.info("\n\nSmart Home Automation System");
		SmartHomeAutomationMain.main();
		log.info("\n\nE-commerce Platform Checkout System");
		ECommercePlatformMain.main();
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

Smart Home Automation System
2024-05-29T12:09:00.445+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SmartDevice      : Device is on
2024-05-29T12:09:00.445+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.s.PowerSavingModeDecorator           : Power-saving mode activated
2024-05-29T12:09:00.445+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SmartDevice      : Device is off
2024-05-29T12:09:00.445+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SmartDevice      : Device is on
2024-05-29T12:09:00.446+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.s.PowerSavingModeDecorator           : Power-saving mode activated
2024-05-29T12:09:00.446+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.s.VacationModeDecorator              : Vacation mode activated
2024-05-29T12:09:00.446+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SmartDevice      : Device is off
2024-05-29T12:09:00.447+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SecuritySystem   : High security system activated
2024-05-29T12:09:00.447+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.smarthomeautomation.SecuritySystem   : Low security system activated
2024-05-29T12:09:00.448+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.s.EcoFriendlyStrategy                : Eco-friendly temperature regulation
2024-05-29T12:09:00.449+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.s.QuickCoolStrategy                  : Quick cool temperature regulation
2024-05-29T12:09:00.450+05:30  INFO 28636 --- [patterns] [  restartedMain] d.patterns.smarthomeautomation.VendorA   : Vendor A device is on
2024-05-29T12:09:00.451+05:30  INFO 28636 --- [patterns] [  restartedMain] d.patterns.smarthomeautomation.VendorB   : Vendor B device activated
2024-05-29T12:09:00.452+05:30  INFO 28636 --- [patterns] [  restartedMain] design.patterns.PatternsApplication      :

E-commerce Platform Checkout System
2024-05-29T12:09:00.456+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.e.ECommercePlatformMain              : Base Product : Laptop  Price : 1000.0
2024-05-29T12:09:00.457+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.e.ECommercePlatformMain              : After Gift Wrapping : Laptop (Gift Wrapped) Price : 1005.0
2024-05-29T12:09:00.457+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.e.ECommercePlatformMain              : After Adding Warranty : Laptop (Gift Wrapped) (Extended Warranty)  Price : 1025.0
2024-05-29T12:09:00.459+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.e.ECommercePlatformMain              : Cart Total after Discount and Quantity Update : 1845.0
2024-05-29T12:09:00.460+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.e.ECommercePlatformMain              : Shipping Cost Standard : 3.5
2024-05-29T12:09:00.462+05:30  INFO 28636 --- [patterns] [  restartedMain] d.p.ecommerceplatform.PayPalAdapter      : Paid 1848.5 using PayPal.
 */
}
