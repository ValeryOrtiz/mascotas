package co.edu.uniquindio.poo;

public record Pets(String name, Species species, Race race, byte age, Gender gender, Colour colour, double weight){
    
    public Pets{
    assert name != null && !name.isBlank():"El nombre debe ser diferente";
    assert species != null:"La especie debe ser diferente";
    assert race != null:"La raza debe ser diferente";
    assert gender != null:"El genero debe ser diferente";
    assert age>0:"La edad debe ser mayor a cero";
    assert colour != null:"El telefono debe ser diferente";
    assert weight>0:"El peso debe ser mayor a cero";
    }
    
    @Override
    public String toString(){
        return "Mascota"+"\n"+
                "{Nombre="+name+"\n"+
                "Especie="+species+"\n"+
                "Raza="+race+"\n"+
                "Genero="+gender+"\n"+
                "Edad="+age+"\n"+
                "Color="+colour+"\n"+
                "Peso="+weight+
                '}';
    }
}
