package lesson_44.code.appVariant.dto;

public class ClientRequestFind <T>{
    private T findParam;

    public ClientRequestFind(T findParam) {
        this.findParam = findParam;
    }

    public T getFindParam() {
        return findParam;
    }

    @Override
    public String toString() {
        return "ClientRequestFind{" +
                "findParam=" + findParam +
                '}';
    }
}
