module proz.calcapp {
	exports proz.calcapp;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires transitive proz.calc;

	opens proz.calcapp to javafx.fxml;
}