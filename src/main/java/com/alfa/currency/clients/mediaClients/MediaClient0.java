package com.alfa.currency.clients.mediaClients;

import com.alfa.currency.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media0", url = "${mediaUrl0}", qualifier = "media0")
public interface MediaClient0 extends DownloadingGifInterface {
}
