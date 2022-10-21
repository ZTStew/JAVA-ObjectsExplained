public abstract class AbstractLivingCreature {
    /* Attributes */
    public String creature_species;
    public String creature_name;
    public int creature_age;
    public String creature_environment;
    public String metamorphosis;
    String creature_color = "#397889";
    float creature_speed = 45.783f;
    public String creature_movement_method;
    public float creature_location_x;
    public float creature_location_y;
    /* Attributes */

    
    /* Methods */
    /* Getters */
    public String getCreature_species() {
        return creature_species;
    }
    public String getCreature_name() {
        return creature_name;
    }
    public int getCreature_age() {
        return creature_age;
    }
    public String getCreature_environment() {
        return creature_environment;
    }
    public String getMetamorphos() {
        return metamorphosis;
    }
    public String getCreature_color() {
        return creature_color;
    }
    public float getCreature_speed() {
        return creature_speed;
    }
    public String getCreature_movement_method() {
        return creature_movement_method;
    }
    public float getCreature_location_x() {
        return creature_location_x;
    }
    public float getCreature_location_y() {
        return creature_location_y;
    }
    /* Getters */
    
    /* Setters */
    public void setCreature_species(String creature_species) {
        this.creature_species = creature_species;
    }
    public void setCreature_name(String creature_name) {
        this.creature_name = creature_name;
    }
    public void setCreature_age(int creature_age) {
        this.creature_age = creature_age;
    }
    public void setCreature_environment(String creature_environment) {
        this.creature_environment = creature_environment;
    }
    public void setMetamorphosis(String metamorphosis) {
        this.metamorphosis = metamorphosis;
    }
    public void setCreature_color(String creature_color) {
        this.creature_color = creature_color;
    }
    public void setCreature_speed(float creature_speed) {
        this.creature_speed = creature_speed;
    }
    public void setCreature_movement_method(String creature_movement_method) {
        this.creature_movement_method = creature_movement_method;
    }
    public void setCreature_location_x(float creature_location_x) {
        this.creature_location_x = creature_location_x;
    }
    public void setCreature_location_y(float creature_location_y) {
        this.creature_location_y = creature_location_y;
    }
    /* Setters */
    /* Methods */
}
