package project.android.com.connect24;

public class RequestModel
{
    private String request_type;

    public RequestModel()
    {

    }

    public String getRequest_type()
    {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public RequestModel(String request_type)
    {
        this.request_type = request_type;
    }
}
