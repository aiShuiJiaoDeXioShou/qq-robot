package com.yangteng.dev.reptile

import net.mamoe.mirai.contact.Contact.Companion.sendImage
import net.mamoe.mirai.event.events.GroupMessageEvent
import java.io.File


// 爬取宝可梦的基本信息
suspend fun reptilePokemon(pokemon: String,gme: GroupMessageEvent) {
    // 爬取宝可梦的信息
    gme.subject.sendImage(File("D:\\Code\\go_code\\reptile\\static\\img\\${pokemon}官方图.png"))
}