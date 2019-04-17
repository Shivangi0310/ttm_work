public class Wheels {
    String company;

    public Wheels() {
    }

    public Wheels(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "company='" + company + '\'' +
                '}';
    }
}
