package com.yangteng.dev.authority

import com.yangteng.dev.comm.Config
import net.mamoe.mirai.event.events.GroupMessageEvent

object GroupAuthority {
    /**
     * 验证是否在本群启动机器人
     */
    fun authorityGroup(gme : GroupMessageEvent) {

        for (qqGroupId in Config.group) {
            if (gme.group.id != qqGroupId){
                return
            }
        }

    }
}
