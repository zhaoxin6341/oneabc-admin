package com.vhouzi.abc.admin.system.domain.wechat;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author xuzj157
 * @date 2020/1/31 17:37
 */
@Data
@Accessors(chain = true)
public class WechatMenu {

    private Long id;
    private MenuType type;
    private String menuJson;
    private String menuId;
    private String remark;
    private Date createTime;

    /**
     * 类型
     */
    public enum MenuType {
        /**
         * //自定义
         */
        CONDITIONAL_MENU_TYPE,
        /**
         * //普通
         */
        COMMON_MENU_TYPE
    }

}
