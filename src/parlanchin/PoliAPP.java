package parlanchin;

class PoliAPP
{
public static void main(String []args)
{
Animal gato = new Gato();
//Gato gato=new Gato();
hazleHablar(gato);
Cucu cucu = new Cucu();
//Cucu cucu=new Cucu();
hazleHablar(cucu);
cucu.darHora();

Animal perro = new Perro();
//Perro perro=new Perro();
hazleHablar(perro);
}

static void hazleHablar(Parlanchin sujeto){
sujeto.habla();
}

}