package mvc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import mvc.memberDAO;
import mvc.memberDTO;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		memberDAO dao = new memberDAO();
		logDAO dao1 = new logDAO();
		quizDAO dao2 = new quizDAO();
		// 아스키코드 클래스객체 및 대사 객체
		askii askii = new askii();
		line line = new line();
		// 음악개체
		MusicCon con = new MusicCon();
		MP3Player mp3 = new MP3Player();
		// 개임시작
		askii.java();		

		// 1. 회원가입-join class 그대로 가져오기
		try {
			while (true) {
				int mark = 0;
				int life = 5;
				con.play(7);
				System.out.print("[1]회원가입 [2]로그인 [3]랭킹보기 [4]게임종료 >> ");
				int choice = sc.nextInt();
				System.out.println();
				if (choice == 1) {
					System.out.println("********************************************************");
					System.out.print("ID입력: ");
					String id = sc.next();
					System.out.print("PW입력: ");
					String pw = sc.next();
					System.out.print("이름입력: ");
					String name = sc.next();

					int row = dao.join(id, pw, name);

					if (row > 0) {
						System.out.println("회원가입 성공");
						System.out.println("*************************************************************");
					} else {
						System.out.println("회원가입 실패");
						System.out.println("*************************************************************");
					}

					// 2. 로그인
				} else if (choice == 2) {
					System.out.println("*************************************************************");
					System.out.print("ID입력: ");
					String id = sc.next();
					System.out.print("PW입력: ");
					String pw = sc.next();

					memberDTO dto = dao.login(id, pw);

					if (dto != null) {

						System.out.println();
						System.out.println("로그인 성공!!!!");
						System.out.println(">>  " + dto.getName() + "  <<님 환영합니다");
						System.out.println();
						System.out.println("*************************************************************");

						//////////// 게임시작0. 모드선택/////////////////
						System.out.println();
						System.out.println("=======================게임모드를 선택하세요========================");
						System.out.println();
						System.out.print("[1]스토리모드 [2]무한모드 >> ");
						int modChoice = sc.nextInt();
						System.out.println();
						if (modChoice == 1) {
							System.out.println("********************스토리 모드를 선택하셨습니다******************");
							System.out.println();

							//////////// 게임시작1. 캐릭터선택/////////////////
							
							System.out.println();
							System.out.println("=========================캐릭터를 선택하세요======================");
							System.out.println();
							System.out.print("[1]안미연 [2]기영민 [3]한성규 [4]최근호 [5]조준수 >> ");
							int chrt = sc.nextInt();
							// 준수선택
							if (chrt == 5) {
								System.out.println();
								askii.notfound();
								System.out.println("아무래도..그는..이 곳을 떠난 것 같다..");
								System.out.println("=================================================================");
								System.out.println();
								continue;
								// 미연선택
							} else if (chrt == 1) {
								askii.car();
								life--;
								// 영민선택
							} else if (chrt == 2) {
								askii.bus();

								// 성규선택
							} else if (chrt == 3) {
								askii.coffee();
								life++;
								// 근호선택
							} else if (chrt == 4) {
								askii.walk();
								// 미선택
							} else {
								System.out.println("제대로 된 사람을 선택해주세요");
							}
							/////////////// 게임시작2. 수업진행////////////////////////
							System.out.println("============================담임등장===========================");
							System.out.println();
							askii.kkn();
							System.out.println("\r\n" + "우리 빅데이터반은 1교시 자바 수업 부터 시작 하겠습니다.\r\n");

							/////////////////// 첫번째 문제//////////////////////
							String mod = "story";							
							String[] arrteacher = { "현진쌤", "경남쌤", "누군가", "병관쌤", "인호쌤" };
							System.out.println();
							System.out.println("========================수업을 시작합니다========================");
							System.out.println("현재 라이프 >> S2 S2 S2 S2 S2");

							int cnt = 0;							
							for (int i = 1; i < 10; i++) {
								ArrayList<quizDTO> list1 = dao2.quizprint(i);
								if (i == 1 || i == 3 || i == 6 || i == 8) {
									con.play(cnt);
									System.out.println();
									System.out.print("***********************<" + (cnt + 1) + "교시> ");
									System.out.println(arrteacher[cnt] + " 등장***********************");
									System.out.println(line.classline(cnt));
									cnt++;

									//////////////// 점심시간 이벤트/////////////////
								} else if (i == 5) {

									con.play(2);
									System.out.println();
									System.out.print("***********************<" + (cnt + 1) + "교시> ");
									System.out.println(arrteacher[cnt] + " 등장***********************");
									for (int num = 1; num < 5; num++) {
										if (chrt == num) {
											System.out.println(line.eventline(chrt - 1));
											line.eventanswer();
											int ans = sc.nextInt();
											System.out.println();

											if (ans == 1) {
												line.eventanswer1();
												int ans1 = sc.nextInt();
												if (ans1 == 2) {
													System.out.println("고마워요...! 자바실력이 올랐어요");
													life++;
													System.out.println("라이프가 1 증가합니다~ S2");
													System.out.println("현재 라이프 : " + life);
												}

											} else if (ans == 2) {
												System.out.println("아... 알겠습니다...인성 뭐야...");
												life--;
												System.out.println("라이프가 1 감소합니다...");
												System.out.println("현재 라이프 : " + life);

											} else if (ans == 3) {
												System.out.println("그럴수도 있죠!! 우리 함께 공부해봐요..!");
												System.out.println("현재 라이프 : " + life);
											}

											break;

										}

									}
									cnt++;

								}
								System.out.println();
								System.out.println(">>문제" + i + "<<");
								System.out.println(list1.get(0).getQuestion());
								System.out.println();
								System.out.print("답 입력 : ");
								int answer1 = sc.nextInt();

								quizDTO dto2 = dao2.quizanswer(i, answer1);

								if (dto2 != null) {
									System.out.println();
									System.out.println("정답을 맞추셨습니다");
									mark = mark + list1.get(0).getMark();									
									System.out.println("현재점수 : " + mark);
								} else {
									System.out.println();
									System.out.println("정답을 틀리셨습니다");
									life--;									
									System.out.println("현재 라이프 : " + life);

								}

								if (life <= 0) {
									System.out.println("라이프를 모두 소진 하셨습니다.. 게임끝!!!");
									break;
								}

							}
							int row = dao1.insertLog(id, mark, mod);
							if (row > 0) {
								System.out.println("기록 저장 성공");
							} else {
								System.out.println("기록 저장 실패");
							}
							
							///////////////// 엔딩/////////////////////
							System.out.println();
							System.out.println("당신의 최종점수: " + mark);
							System.out.println();
							if (life > 0 && mark > 17) {
								con.play(8);
								askii.ferari();
								

							} else if (life > 0 && mark < 18 && mark > 10) {
								con.play(9);
								askii.normal();
								

							} else if (life > 0 && mark < 11) {
								con.play(10);
								askii.blood();
								

							}
							System.out.println();
							System.out.println("다시 시작하시겠습니까?>> [1]Y [2]N");
							System.out.println();
							int end = sc.nextInt();
							if(end==2) {
								System.out.println("게임을 종료합니다.");
								con.stop();
								break;
							}else {
								continue;
							}
							

						} else if (modChoice == 2) {
							/////// 무한모드 선택
							mark = 0;
							life = 5;
							System.out.println("==================무한모드를 도전합니다==================");
							System.out.println("*********기회는 5번!! 틀리면 게임이 종료합니다*******");
							Random r = new Random();
							String mod = "infinity";
							int i = 1;
							con.play(11);

							// 중복없이 어레이에 숫자 담기
							int num = 0;
							int[] array = new int[16];

							for (int j = 0; j < array.length; j++) {
								array[j] = r.nextInt(16) + 10;
								for (int k = 0; k < j; k++) {
									if (array[j] == array[k]) {
										j--;
									}
								}
							}
							// 무한으로 문제 끌어오기
							while (true) {
								ArrayList<quizDTO> list = dao2.quizprint(array[num]);
								System.out.println(num + 1 + "번째 문제");
								System.out.println(list.get(0).getQuestion());
								System.out.println();
								System.out.print("답 입력 : ");
								int answer = sc.nextInt();

								quizDTO dto2 = dao2.quizanswer(array[num], answer);

								if (dto2 != null) {
									System.out.println();
									System.out.println("***정답을 맞추셨습니다***");
									System.out.println();
									mark = mark + list.get(0).getMark();
								} else {
									System.out.println();
									System.out.println("***정답을 틀리셨습니다***");
									System.out.println();
									life--;
									System.out.println("현재 라이프 : " + life);
								}

								num++;

								if (life == 0) {
									if (mp3.isPlaying() == true) {
										mp3.stop();
									}
									System.out.println("게임이 종료되었습니다");
									System.out.println("점수 : " + mark);
									int row = dao1.insertLog(id, mark, mod);

									if (row > 0) {
										System.out.println("기록 저장 성공");
										System.out.println();
									} else {
										System.out.println("기록 저장 실패");
									}
									break;
								}

							}

						}
					} else {
						System.out.println("로그인 실패");
					}

					// 3. 점수보기
				} else if (choice == 3) {
					System.out.print("아이디를 입력하세요: ");
					String id = sc.next();
					ArrayList<logDTO> list = dao1.selectID(id);
					System.out.println("아이디\t점수\t모드\t시간\t");
					int cnt = 0;
					for (logDTO n : list) {
						System.out.println(n.getId() + "\t" + n.getMark() + "\t" + n.getMod() + "\t" + n.getTime());
					}
					System.out.println();
					

				} else if (choice == 4) {
					System.out.println("게임을 종료합니다");
					con.stop();
					break;

				} else {
					System.out.println("제대로 된 번호를 입력해주세요");
				}
			}
		} catch (Exception e) {
			con.stop();
			System.out.println("숫자만 입력하세요");

		}

	}

}