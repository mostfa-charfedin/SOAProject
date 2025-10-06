package entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;
@XmlRootElement
public class Module {
    private String matricule;
    private String nom;
    private int coefficient;
    private int volumeHoraire;
    private TypeModule type;
    private UniteEnseignement uniteEnseignement;

    public Module() {}

    public Module(String matricule, String nom, int coefficient, int volumeHoraire, TypeModule type, UniteEnseignement uniteEnseignement) {
        this.matricule = matricule;
        this.nom = nom;
        this.coefficient = coefficient;
        this.volumeHoraire = volumeHoraire;
        this.type = type;
        this.uniteEnseignement = uniteEnseignement;
    }

    // Getters et Setters
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getCoefficient() { return coefficient; }
    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }

    public int getVolumeHoraire() { return volumeHoraire; }
    public void setVolumeHoraire(int volumeHoraire) { this.volumeHoraire = volumeHoraire; }

    public TypeModule getType() { return type; }  // Retourne l'enum
    public void setType(TypeModule type) { this.type = type; }  // Accepte l'enum

    public UniteEnseignement getUniteEnseignement() { return uniteEnseignement; }
    public void setUniteEnseignement(UniteEnseignement uniteEnseignement) { this.uniteEnseignement = uniteEnseignement; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(matricule, module.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }
}