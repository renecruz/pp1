#include <iostream>
using namespace std;

class ClaseA {
   public:
     int leerValorA() const { return 10; }
};

class ClaseB {
   public:
     int leerValorB() const { return 20; }
};

class ClaseC : public ClaseA, public ClaseB {
  // código de la clase C
};

int main() {
  ClaseC objeto;
  cout << objeto.leerValorA() << endl;
  cout << objeto.leerValorB() << endl;
  // Produce error de compilación por ambigüedad 😵.  
  return 0;
}