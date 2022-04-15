
package isp.lab7.safehome;

import java.util.Objects;

public class Tenant {
    private String name; 

    public Tenant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tenant other = (Tenant) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Tenant{" + "name=" + name + '}';
    }
    
    
}
