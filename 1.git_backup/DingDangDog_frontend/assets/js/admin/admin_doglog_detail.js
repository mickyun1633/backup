// 게시글 삭제
cancelBtn = document.getElementById("btn-remove-detail");
    cancelBtn.addEventListener("click", () => {
      alert("게시글이 삭제되었습니다.");
      location.href = "admin_doglog_list.html";
    });
