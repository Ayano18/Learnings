# Pong Game - Pygame
# Controls:
#   Player 1: W/S keys
#   Player 2: UP/DOWN arrows
#   ESC: quit, R: restart
import pygame
import sys

# --- Settings ---
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 500
FPS = 60

WHITE = (255, 255, 255)
BLACK = (0, 0, 0)

PADDLE_WIDTH = 12
PADDLE_HEIGHT = 90
BALL_SIZE = 14
PADDLE_SPEED = 6
BALL_SPEED_X = 5
BALL_SPEED_Y = 4

class Paddle:
    def __init__(self, x, y):
        self.rect = pygame.Rect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT)
        self.speed = 0

    def move(self):
        self.rect.y += self.speed
        if self.rect.top < 0:
            self.rect.top = 0
        if self.rect.bottom > SCREEN_HEIGHT:
            self.rect.bottom = SCREEN_HEIGHT

    def draw(self, surface):
        pygame.draw.rect(surface, WHITE, self.rect)

class Ball:
    def __init__(self):
        self.reset()

    def reset(self):
        self.rect = pygame.Rect(SCREEN_WIDTH//2 - BALL_SIZE//2,
                                SCREEN_HEIGHT//2 - BALL_SIZE//2,
                                BALL_SIZE, BALL_SIZE)
        self.speed_x = BALL_SPEED_X * (-1 if pygame.time.get_ticks() % 2 == 0 else 1)
        self.speed_y = BALL_SPEED_Y

    def move(self, paddle1, paddle2):
        self.rect.x += self.speed_x
        self.rect.y += self.speed_y

        if self.rect.top <= 0 or self.rect.bottom >= SCREEN_HEIGHT:
            self.speed_y *= -1

        if self.rect.colliderect(paddle1.rect) or self.rect.colliderect(paddle2.rect):
            self.speed_x *= -1

    def draw(self, surface):
        pygame.draw.ellipse(surface, WHITE, self.rect)

def render_text(surface, text, size, center, bold=False):
    font = pygame.font.SysFont("consolas", size, bold=bold)
    surf = font.render(text, True, WHITE)
    rect = surf.get_rect(center=center)
    surface.blit(surf, rect)

def main():
    pygame.init()
    screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
    pygame.display.set_caption("Pong - Pygame")
    clock = pygame.time.Clock()

    paddle1 = Paddle(20, SCREEN_HEIGHT//2 - PADDLE_HEIGHT//2)
    paddle2 = Paddle(SCREEN_WIDTH - 20 - PADDLE_WIDTH, SCREEN_HEIGHT//2 - PADDLE_HEIGHT//2)
    ball = Ball()

    score1 = 0
    score2 = 0
    game_over = False

    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:
                    pygame.quit()
                    sys.exit()
                if event.key == pygame.K_r:
                    score1, score2 = 0, 0
                    ball.reset()
                    paddle1.rect.y = SCREEN_HEIGHT//2 - PADDLE_HEIGHT//2
                    paddle2.rect.y = SCREEN_HEIGHT//2 - PADDLE_HEIGHT//2
                    game_over = False
                if event.key == pygame.K_w:
                    paddle1.speed = -PADDLE_SPEED
                if event.key == pygame.K_s:
                    paddle1.speed = PADDLE_SPEED
                if event.key == pygame.K_UP:
                    paddle2.speed = -PADDLE_SPEED
                if event.key == pygame.K_DOWN:
                    paddle2.speed = PADDLE_SPEED
            elif event.type == pygame.KEYUP:
                if event.key in (pygame.K_w, pygame.K_s):
                    paddle1.speed = 0
                if event.key in (pygame.K_UP, pygame.K_DOWN):
                    paddle2.speed = 0

        if not game_over:
            paddle1.move()
            paddle2.move()
            ball.move(paddle1, paddle2)

            if ball.rect.left <= 0:
                score2 += 1
                ball.reset()
            if ball.rect.right >= SCREEN_WIDTH:
                score1 += 1
                ball.reset()

        screen.fill(BLACK)
        paddle1.draw(screen)
        paddle2.draw(screen)
        ball.draw(screen)
        pygame.draw.aaline(screen, WHITE, (SCREEN_WIDTH//2, 0), (SCREEN_WIDTH//2, SCREEN_HEIGHT))

        render_text(screen, f"{score1}", 48, (SCREEN_WIDTH//4, 40), bold=True)
        render_text(screen, f"{score2}", 48, (SCREEN_WIDTH*3//4, 40), bold=True)

        if game_over:
            render_text(screen, "GAME OVER", 56, (SCREEN_WIDTH//2, SCREEN_HEIGHT//2 - 30), bold=True)
            render_text(screen, "Press R to Restart", 28, (SCREEN_WIDTH//2, SCREEN_HEIGHT//2 + 20))

        pygame.display.flip()
        clock.tick(FPS)

if __name__ == "__main__":
    main()
