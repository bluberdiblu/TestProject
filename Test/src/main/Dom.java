package main;

import main.Sub;

public class Dom {
	Sub sub = new Sub();
public static void main(String[] args) {
	new Dom().start();
}
public void start() {
	sub.say();
}
}
