package ph.rico.spring.sf0311Collections;

	import java.util.List;
	import java.util.Map;
	import java.util.Properties;
	import java.util.Set;

public class Bean {
	
	private List<String> list;

	private Map<String, String> map;

	private Set<String> set;

	private Properties properties;
	
	private List<ObjectA> listO;

	public List<ObjectA> getListO() {
		return listO;
	}

	public void setListO(List<ObjectA> listO) {
		this.listO = listO;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
