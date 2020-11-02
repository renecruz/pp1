#include <iostream>
using namespace std;

class ClaseA {
   public:
     int leerValor() const { return 10; }
};

class ClaseB {
   public:
     int leerValor() const { return 20; }
};

class ClaseC : public ClaseA, public ClaseB {
  // código de la clase C
};

int main() {
  ClaseC objeto;
  cout << objeto.ClaseA::leerValor() << endl;
  // compila sin problemas 😏.
  return 0;
}