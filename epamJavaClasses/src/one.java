import java.util.Objects;

public class one {
    private long subjectId;
    private String name;
//основные свойства информационного класса конструктор, геттеры и сеттеры, иквел хэш код для сравнения коллекций, реализация метода tostring - когда объект выводится в консоль в строковом виде
    public one() {

    }

    public one(long subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        one one = (one) o;
        return subjectId == one.subjectId &&
                Objects.equals(name, one.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, name);
    }

    @Override
    public String toString() {
        return "one{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                '}';
    }
}
