/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyFilter;

import java.util.ArrayList;

/**
 *
 * @author tuananh
 */
public class DescriptionKey {

    private String desKey = "";
    private String desKeyContent = "";

    public DescriptionKey(String desKey, String desKeyContent) {
        this.desKey = desKey;
        this.desKeyContent = desKeyContent;
    }

    /**
     * @return the desKey
     */
    public String getDesKey() {
        return desKey;
    }

    /**
     * @param desKey the desKey to set
     */
    public void setDesKey(String desKey) {
        this.desKey = desKey;
    }

    /**
     * @return the desKeyContent
     */
    public String getDesKeyContent() {
        return desKeyContent;
    }

    /**
     * @param desKeyContent the desKeyContent to set
     */
    public void setDesKeyContent(String desKeyContent) {
        this.desKeyContent = desKeyContent;
    }
    /**
     * public DescriptionKey(){ desKey.add("Tổng quan="); desKey.add("Chủ đầu
     * tư="); desKey.add("Tiến độ"); desKey.add("Hạ tầng - Quy hoạch=");
     * desKey.add("Bán hàng="); desKey.add("Bán hàng="); desKey.add("Vị trí=");
     * desKey.add("Thiết kế - Mẫu nhà="); }
     */

}
