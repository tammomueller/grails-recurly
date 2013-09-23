package grails.plugin.recurly.helpers

class GenericNodeTypeCaster{

    public String convertToCompatibleString(Object delegate) {
        String convertedString = null
        if (delegate) {
            convertedString = delegate as String
        }
        return convertedString
    }

    public Date convertNodeToDate(Object node) {
        if (node == null) {
            return null
        }
        String nodeString = node
        Date convertedDate
        if (nodeString) {
            try {
                convertedDate = Date.parse("yyyy-MM-dd'T'hh:mm:ss'Z'", nodeString)
            } catch (Exception e) {
                convertedDate = null
            }
        }
        return convertedDate
    }

    public Integer convertNodeToInteger(Object node) {
        if (node == null) {
            return 0
        }
        String nodeString = node
        Integer convertedInt
        if (!nodeString) {
            convertedInt = 0
        } else {
            try {
                convertedInt = (nodeString as Integer)
            } catch (Exception e) {
                convertedInt = 0
            }
        }
        return convertedInt
    }
}
