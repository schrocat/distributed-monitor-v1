package json.util;

import java.util.List;

public class ListObject extends AbstractJsonObject {

	private List<?> values;

	public List<?> getValues() {
		return values;
	}

	public void setValues(List<?> values) {
		this.values = values;
	}
}
