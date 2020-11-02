#include <iostream>
using namespace std;

class Deportista {
  public: 
    void entrenar() const {
      cout << "Entrenando duro..." << endl;
    }
};

class Corredor: public Deportista {
  public:
    void calentar() const {
      cout << "Haciendo estiramientos..." << endl;
    }
};

class Seleccionado: public Deportista {
  public:
    void calificar() const {
      cout << "¡Esforzandome para calificar!" << endl;
    }
};

class CorredorSeleccionado: public Corredor, public Seleccionado {
  public:
    void ganarMedalla() const {
      cout << "¡Compitiendo para ganar!" << endl;
    }
};

int main() {
  CorredorSeleccionado cs;
  cs.calentar();
  cs.calificar();
  cs.ganarMedalla();
  cs.entrenar();
  return 0;
}