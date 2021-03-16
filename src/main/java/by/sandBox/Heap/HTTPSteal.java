package by.sandBox.Heap;

public class HTTPSteal {

    String HTTPContent;
    String group;

    public HTTPSteal(String group) {
        this.group = group;
        HTTPContent = URLWorker.getURLContent(" https://journal.bsuir.by/api/v1/studentGroup/schedule?studentGroup=" + group);
    }

    public String getHTTPContent() {
        return HTTPContent;
    }

    public String getGroup() {
        return group;
    }
}
