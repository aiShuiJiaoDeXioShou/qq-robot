package com.example.com.yangteng.dev

import com.yangteng.dev.authority.GroupAuthority
import com.yangteng.dev.reptile.reptilePokemon
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.contact.Contact.Companion.sendImage
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.Image
import net.mamoe.mirai.message.data.content
import net.mamoe.mirai.utils.ExternalResource.Companion.toExternalResource
import net.mamoe.mirai.utils.info
import java.io.File

object App : KotlinPlugin(
    JvmPluginDescription(
        id = "com.example.demo1",
        name = "Demo1",
        version = "0.1.0",
    ) {
        author("林河")
    }
) {
    override fun onEnable() {
        GlobalEventChannel.parentScope(this).subscribeAlways<GroupMessageEvent> {

            // 验证群号
            GroupAuthority.authorityGroup(it)

            // 如果群号通过则执行下面这个方法
            val content = message.content
            val comm = content.split(" ")
            when (comm[0]) {
                "add" -> {

                }
                "get" -> {

                    when (comm[1]) {
                        "pokemon" -> {

                            when (comm[2]) {
                                "img" -> {
                                    try {
                                        reptilePokemon(comm[3], it)
                                    } catch (e: Exception) {
                                        subject.sendMessage("[亲,未找到该图片哦!,请通知女客服赶紧上新吧😀!]")
                                    }
                                }
                            }

                        }
                    }

                }
                "del" -> {

                }
            }
        }
    }
}