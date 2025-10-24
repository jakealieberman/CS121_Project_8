# build main
main: main.class gameMenu.class playGame.class humanGuesser.class computerGuesser.class


# compile main.java
main.class: main.java gameMenu.class playGame.class humanGuesser.class computerGuesser.class
	javac main.java

# compile gameMenu.java
gameMenu.class: gameMenu.java
	javac gameMenu.java

# compile playGame.java
playGame.class: playGame.java gameMenu.class humanGuesser.class computerGuesser.class
	javac playGame.java

# compile humanGuesser.java
humanGuesser.class: humanGuesser.java
	javac humanGuesser.java

# compile computerGuesser.java
computerGuesser.class: computerGuesser.java
	javac computerGuesser.java

# clean up all class files
clean:
	rm -f *.class