package com.hi.udemy

import javax.persistence.*

@Entity
@Table(name = "users")
class User() {  // ✅ 기본 생성자

    var userId: String = ""
    var password: String = ""

    @Id
    @GeneratedValue
    var id: Long? = null

    // ✅ 보조 생성자
    constructor(userId: String, password: String, id: Long? = null) : this() {
        this.userId = userId
        this.password = password
        this.id = id
    }
}
