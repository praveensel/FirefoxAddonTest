package Common.core.purge;

/**
 * Created by praveen on 2/13/2015.
 */
import org.apache.commons.httpclient.HttpMethodBase;

/**
 * @author Karol 'kkarolk' Kujawiak
 */
public class PurgeMethod extends HttpMethodBase {

    public PurgeMethod() {
        super();
        setFollowRedirects(true);
    }

    public PurgeMethod(String url) {
        super(url);
        setFollowRedirects(true);
    }

    @Override
    public String getName() {
        return "PURGE";
    }
}