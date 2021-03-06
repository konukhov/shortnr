package com.shortnr.serialization

import com.shortnr.tables._
import spray.json._

object ShortnrJsonProtocol extends DefaultJsonProtocol {
  implicit def folderFormat         = jsonFormat3(Folder)
  implicit def linkFormat           = jsonFormat5(Link)
  implicit def tokenFormat          = jsonFormat1(UserToken)
  implicit def linkUrlFormat        = jsonFormat1(LinkUrl)
  implicit def linkWithClicksFormat = jsonFormat6(LinkWithClicks)
}