package kr.or.human;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {

	@RequestMapping("/upload")
	public String upload(MultipartHttpServletRequest req) {

		// Multipart로 보내고
		// HttpServletRequest로 받았다면
		// getParameter로 가져올 수 없지만
		// MultipartHttpServletRequest는 된다
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: " + title);
		System.out.println("content: " + content);

		// 파일 처리
		MultipartFile mf = req.getFile("file1");

		long fileSize = mf.getSize();
		System.out.println("fileSize: " + fileSize);

		String fileName = mf.getOriginalFilename();
		System.out.println("fileName: " + fileName);

		try {
			String path = "C:\\temp\\upload";
			String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
			System.out.println("safeFileName: " + safeFileName);
			File file = new File(safeFileName);

			mf.transferTo(file);

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redierct:uploadForm.jsp";
	}
	
	@RequestMapping("/uploads")
	public String uploads(MultipartHttpServletRequest req) {

		// Multipart로 보내고
		// HttpServletRequest로 받았다면
		// getParameter로 가져올 수 없지만
		// MultipartHttpServletRequest는 된다
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: " + title);
		System.out.println("content: " + content);

		// 파일 처리
//		MultipartFile mf = req.getFile("file1");
		List<MultipartFile> mfs = req.getFiles("file1");
		for(MultipartFile mf : mfs) {
			long fileSize = mf.getSize();
			System.out.println("fileSize: " + fileSize);
			
			String fileName = mf.getOriginalFilename();
			System.out.println("fileName: " + fileName);
			
			try {
				String path = "C:\\temp\\upload";
				String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
				System.out.println("safeFileName: " + safeFileName);
				File file = new File(safeFileName);
				
				mf.transferTo(file);
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		return "uploadForm";
	}
}
