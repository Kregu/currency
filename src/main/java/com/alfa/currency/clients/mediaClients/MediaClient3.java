package com.alfa.currency.clients.mediaClients;

import com.alfa.currency.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media3", url = "${mediaUrl3}", qualifier = "media3")
public interface MediaClient3 extends DownloadingGifInterface {
}
