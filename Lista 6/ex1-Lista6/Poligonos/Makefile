all: exec

main.o: main.cpp Quadrado.cpp Triangulo.cpp
	g++ -o main.o -c main.cpp

Poligono.o:
	g++ -o Poligono.o -c Poligono.cpp

Quadrado.o: Poligono.cpp
	g++ -o Quadrado.o -c Quadrado.cpp

Triangulo.o: Poligono.cpp
	g++ -o Triangulo.o -c Triangulo.cpp

exec: main.o Poligono.o Quadrado.o Triangulo.o
	g++ -o exec main.o Poligono.o Quadrado.o Triangulo.o

run:
	./exec

clean:
	rm -f *.o
	rm -f exec